package org.kiwi.fp.number.classifier;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NumberClassifierTest {

    @Test
    public void should_be_abundant() {
        assertThat(NumberClassifier.isPerfect(12), is(false));
        assertThat(NumberClassifier.isAbundant(12), is(true));
        assertThat(NumberClassifier.isDeficient(12), is(false));
    }

    @Test
    public void should_be_perfect() {
        assertThat(NumberClassifier.isPerfect(6), is(true));
        assertThat(NumberClassifier.isAbundant(6), is(false));
        assertThat(NumberClassifier.isDeficient(6), is(false));
    }

    @Test
    public void should_be_deficient() {
        assertThat(NumberClassifier.isPerfect(2), is(false));
        assertThat(NumberClassifier.isAbundant(2), is(false));
        assertThat(NumberClassifier.isDeficient(2), is(true));
    }
}
