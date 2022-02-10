package top.xjinfeng.java.benchmark;

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

// https://github.com/openjdk/jmh
// https://www.cnkirito.moe/java-jmh/#%E9%99%B7%E9%98%B1-1%EF%BC%9A%E6%AD%BB%E7%A0%81%E6%B6%88%E9%99%A4
@BenchmarkMode({Mode.All})
//线程数
@Threads(1)
//进程数
@Fork(1)
//热身
@Warmup(iterations = 3, time = 100, timeUnit = TimeUnit.MILLISECONDS)
//正式测试
@Measurement(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Slf4j
public class BenchmarkTest {

    private static int i = 0;

    @Benchmark
    public void test(){
    }

    @Benchmark
    public void testPrintln(){
        String s = "d";
        System.out.println(s);
    }

    @Benchmark
    public void testLog(){
        String s = "d";
        log.info(s);
    }

}
