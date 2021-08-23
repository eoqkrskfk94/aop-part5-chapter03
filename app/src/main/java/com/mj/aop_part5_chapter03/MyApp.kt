package com.mj.aop_part5_chapter03

import android.app.Application
import androidx.camera.camera2.Camera2Config
import androidx.camera.core.CameraXConfig

class MyApp: Application(), CameraXConfig.Provider {

    override fun getCameraXConfig(): CameraXConfig = Camera2Config.defaultConfig()
}