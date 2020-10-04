package academy.learningprogramming;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Setter(AccessLevel.NONE)
@Component
public class NumberGeneratorImpl implements NumberGenerator{

    // == fields ==
    private final Random random = new Random();

    private final int maxNumber;

    private final int minNumber;

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int next() {
        // example: min = 5 max = 20 -> max=min=15 range 0-15 + min -> 5-20
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
