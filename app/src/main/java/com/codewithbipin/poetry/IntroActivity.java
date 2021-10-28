package com.codewithbipin.poetry;
import android.os.Bundle;
import androidx.annotation.Nullable;
import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                .title("Hello")
                .image(R.drawable.splash1)
                .buttonsColor(R.color.red1)
                .backgroundColor(R.color.red1)
                .build());

        addSlide(new SlideFragmentBuilder()
                .title("Hello")
                .image(R.drawable.splash2)
                .buttonsColor(R.color.red1)
                .backgroundColor(R.color.red1)
                .build());

        addSlide(new SlideFragmentBuilder()
                .title("Hello")
                .image(R.drawable.splash3)
                .buttonsColor(R.color.red1)
                .backgroundColor(R.color.red1)
                .build());

    }
}
