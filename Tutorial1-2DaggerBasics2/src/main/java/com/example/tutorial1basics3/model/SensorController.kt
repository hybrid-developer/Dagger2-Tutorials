package com.example.tutorial1basics3.model

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager

class SensorController(context: Context) : SensorEventListener {

    private val rotationVector: Sensor
    private val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager

    // Identity matrix
    private val I = FloatArray(9)

    // Rotation Matrices
    private val rotationMatrix = FloatArray(9)

    // Array that contains azimuth, pitch and roll
    private val orientation = FloatArray(3)

    // Output values received from MF or Rotation Vector Sensor
    private var azimuth = 0f
    private var pitch = 0f
    private var roll = 0f
    private var mOnSensorEventChangeListener: OnSensorEventChangeListener? = null

    init { // Sensor Manager
        rotationVector = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)
    }

    fun onResume(sensorDelay: Int) {
        sensorManager.registerListener(this, rotationVector, sensorDelay)
    }

    fun onPause() {
        sensorManager.unregisterListener(this)
        mOnSensorEventChangeListener = null
    }

    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {}

    override fun onSensorChanged(event: SensorEvent) {

        when (event.sensor.type) {
            Sensor.TYPE_ROTATION_VECTOR -> SensorManager.getRotationMatrixFromVector(rotationMatrix, event.values)
        }
        getOrientationAnglesFromRVSensor()

        // Listener Values
        if (mOnSensorEventChangeListener != null) {
            mOnSensorEventChangeListener!!.getOrientationValues(azimuth, pitch, roll)
        }
    }

    private fun getOrientationAnglesFromRVSensor() {
        SensorManager.getOrientation(rotationMatrix, orientation)
        azimuth = (orientation[0] * RAD_TO_DEG + 360) % 360
        pitch = -orientation[1] * RAD_TO_DEG
        roll = 90 + orientation[2] * RAD_TO_DEG
    }

    fun setSensorEventChangeListener(listener: OnSensorEventChangeListener?) {
        mOnSensorEventChangeListener = listener
    }

    interface OnSensorEventChangeListener {
        fun getOrientationValues(azimuth: Float, pitch: Float, roll: Float)
    }

    companion object {
        // Convert from radian to degrees
        private const val RAD_TO_DEG = (180 / Math.PI).toFloat()
    }


}