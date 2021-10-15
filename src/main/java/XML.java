import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XML {

    private Integer fieldOne;
    private String fieldTwo;
    private boolean fieldThree;

    public XML(Integer fieldOne, String fieldTwo, boolean fieldThree) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }

    public XML() {
    }

    public Integer getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(Integer fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public boolean isFieldThree() {
        return fieldThree;
    }

    public void setFieldThree(boolean fieldThree) {
        this.fieldThree = fieldThree;
    }

    @Override
    public String toString() {
        return "XML{" +
                "fieldOne=" + fieldOne +
                ", fieldTwo='" + fieldTwo + '\'' +
                ", fieldThree=" + fieldThree +
                '}';
    }

    private static void serializeToXML(XML settings) throws IOException {

        FileOutputStream test = new FileOutputStream("Test.xml");
        XMLEncoder encoder = new XMLEncoder(test);
        encoder.setExceptionListener(e -> System.out.println("Exception! :" + e.toString()));
        encoder.writeObject(settings);
        encoder.close();
        test.close();
    }

    private static XML deserializeFromXML() throws IOException {
        FileInputStream test = new FileInputStream("Test.xml");
        XMLDecoder decoder = new XMLDecoder(test);
        XML decodedSettings = (XML) decoder.readObject();
        decoder.close();
        test.close();
        return decodedSettings;
    }
}
//         run in main
//        XML settings = new XML();
//        settings.setFieldOne(1);
//        settings.setFieldTwo("Grigore Barbăneagră");
//        settings.setFieldThree(true);
//        serializeToXML(settings);
//
//        XML loadedForm = deserializeFromXML();
//        System.out.println(loadedForm);

