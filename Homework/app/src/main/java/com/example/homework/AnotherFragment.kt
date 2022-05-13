

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.homework.domain.base.BaseFragment
import com.example.homework.databinding.AnotherFragmentBinding
import com.example.homework.domain.AnotherFragmentArgs


class AnotherFragment : BaseFragment<AnotherFragmentBinding>() {

    private val args: AnotherFragmentArgs by navArgs()

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): AnotherFragmentBinding = AnotherFragmentBinding.inflate(inflater, container, false)

    override fun AnotherFragmentBinding.onBindView(savedInstanceState: Bundle?) {
        textView2.setOnClickListener {
            findNavController().popBackStack()
        }
        println("args.fragmentId = ${args.fragmentId}")
    }
}

