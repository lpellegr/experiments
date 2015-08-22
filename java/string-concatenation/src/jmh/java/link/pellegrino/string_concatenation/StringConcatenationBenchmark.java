package link.pellegrino.string_concatenation;

import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
@BenchmarkMode(Mode.SingleShotTime)
@Measurement(batchSize = 100000, iterations = 20)
@Warmup(batchSize = 100000, iterations = 10)
@Fork(5)
public class StringConcatenationBenchmark {

    private String string;

    private String stringConcat;

    private StringBuilder stringBuilder;

    private StringBuffer stringBuffer;

    @Setup(Level.Iteration)
    public void setup() {
        string = "";
        stringConcat = "";
        stringBuilder = new StringBuilder();
        stringBuffer = new StringBuffer();
    }

    @Benchmark
    public void stringConcatenation() {
        string += "some more data";
    }

    @Benchmark
    public void stringConcatConcatenation() {
        stringConcat = stringConcat.concat("some more data");
    }

    @Benchmark
    public void stringBuilderConcatenation() {
        stringBuilder.append("some more data");
    }

    @Benchmark
    public void stringBufferConcatenation() {
        stringBuffer.append("some more data");
    }

}
