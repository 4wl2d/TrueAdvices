package ind.wl2d.trueadvices.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ind.wl2d.trueadvices.favourite.presentation.FavouriteFragments
import ind.wl2d.trueadvices.history.presentation.HistoryFragments
import ind.wl2d.trueadvices.search.presentation.SearchFragments

class SectionsPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HistoryFragments()
            1 -> SearchFragments()
            2 -> FavouriteFragments()
            else -> throw IllegalStateException()
        }
    }
}

