import org.junit.Test;
public class Main {
    public static void main(String[] args) {
        CubeTester coob = new CubeTester();
        coob.TestSingleArgumentConstructorNoException();
        coob.TestNoArgumentConstructorNoException();
        coob.TestSetter();
        coob.TestSetterNegative();
        coob.TestSetterZero();
        coob.TestSingleArgumentConstructorNegative();
        coob.TestSurfaceArea();
        coob.TestSurfaceAreaTwo();
        coob.TestVolume();
        coob.TestVolumeTwo();
    }
}