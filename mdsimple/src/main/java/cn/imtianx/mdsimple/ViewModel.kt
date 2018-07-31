package cn.imtianx.mdsimple

import android.content.Context
import cn.imtianx.mdsimple.behavior.FabScrollListenerActivity
import cn.imtianx.mdsimple.behavior.FabCustomBehaviorActivity
import cn.imtianx.mdsimple.base.BaseViewModel
import cn.imtianx.mdsimple.navigation.NavigationActivity

/**
 * <pre>
 *     @desc: viewmodel
 * </pre>
 * @author 奚岩
 * @date 2018/7/30 10:02 PM
 */

class MainViewModel : BaseViewModel() {

    fun jump2Navigsation(context: Context) {
        NavigationActivity.launch(context)
    }

    fun jump2FabScroll(context: Context) {
        FabScrollListenerActivity.launch(context)
    }

    fun jump2FabCustomBehavior(context: Context) {
        FabCustomBehaviorActivity.launch(context)
    }
}