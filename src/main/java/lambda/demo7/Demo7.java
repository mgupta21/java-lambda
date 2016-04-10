package lambda.demo7;

/**
 * Created by Mayank on 4/3/2016.
 */
// Constructor Reference
public class Demo7 {
    public static void main(String[] args) {
        Picture picture = pictureInstance().create(2);
        Picture titanic = pictureInstance2().create(2, "Titanic");

        String[] strs = testArrayConstructorReferences().create(3);

    }

    public static PictureFactory pictureInstance() {
        // PictureFactory m = i -> new Picture(i);
        PictureFactory m = Picture::new;
        return m;
    }

    public static PictureFactory2 pictureInstance2() {
        PictureFactory2 p = Picture::new;
        return p;
    }

    public static StringArray testArrayConstructorReferences() {
        // StringArray stringArray = size -> new String[size];
        StringArray stringArray = String[]::new;
        return stringArray;
    }
}

interface PictureFactory {
    Picture create(int id);
}

interface PictureFactory2 {
    Picture create(int id, String name);
}

interface StringArray {
    String[] create(int size);
}

class Picture {

    int id;
    String name;

    Picture(int id) {
        this.id = id;
    }

    Picture(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
