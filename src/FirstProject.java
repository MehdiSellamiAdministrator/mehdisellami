public class FirstProject {
    public static void main(String[] args){
        var textBox1 = new TextBox();
        textBox1.setText("Box1");
        System.out.println(textBox1.text);

        var textBox2 = textBox1;
        textBox2.setText("Hello Hello");
        System.out.println(textBox2.text);
    }
}
