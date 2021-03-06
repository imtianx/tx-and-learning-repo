package cn.imtianx.mdsimple

import android.content.Context
import cn.imtianx.mdsimple.appbar.AppbarActivity
import cn.imtianx.mdsimple.appbar.AppbarCollapsingActivity
import cn.imtianx.mdsimple.behavior.FabScrollListenerActivity
import cn.imtianx.mdsimple.behavior.FabCustomBehaviorActivity
import cn.imtianx.mdsimple.base.BaseViewModel
import cn.imtianx.mdsimple.behavior.TitleBehaviorActivity
import cn.imtianx.mdsimple.bottomsheet.BottomSheetDialogActivity
import cn.imtianx.mdsimple.navigation.NavigationActivity
import cn.imtianx.mdsimple.navigation.SearchViewActivity
import cn.imtianx.mdsimple.palette.PaletteActivity
import cn.imtianx.mdsimple.tablayout.TabLayoutActivity

/**
 * <pre>
 *     @desc: viewmodel
 * </pre>
 * @author 奚岩
 * @date 2018/7/30 10:02 PM
 */

class MainViewModel : BaseViewModel() {

    fun jump2Navigation(context: Context) {
        NavigationActivity.launch(context)
    }

    fun jump2SearchView(context: Context) {
        SearchViewActivity.launch(context)
    }

    fun jump2Appbar(context: Context) {
        AppbarActivity.launch(context)
    }

    fun jump2AppbarCollapsing(context: Context) {
        AppbarCollapsingActivity.launch(context)
    }

    fun jump2TabLayout(context: Context) {
        TabLayoutActivity.launch(context)
    }

    fun jump2BottomSheetDialog(context: Context) {
        BottomSheetDialogActivity.launch(context)
    }

    fun jump2Palette(context: Context) {
        PaletteActivity.launch(context)
    }

    fun jump2FabScroll(context: Context) {
        FabScrollListenerActivity.launch(context)
    }

    fun jump2FabCustomBehavior(context: Context) {
        FabCustomBehaviorActivity.launch(context)
    }

    fun jump2TitleBehavior(context: Context) {
        TitleBehaviorActivity.launch(context)
    }
}