package ind.wl2d.trueadvices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import ind.wl2d.trueadvices.ui.main.SectionsPagerAdapter
import ind.wl2d.trueadvices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager2: ViewPager2 = binding.viewPager2
        viewPager2.adapter = sectionsPagerAdapter
        TabLayoutMediator(
            binding.tabs, viewPager2
        ) { tab, position -> tab.setText(TAB_TITLES[position]) }.attach()
        if (savedInstanceState == null) binding.tabs.selectTab(binding.tabs.getTabAt(1));
    }
}