package Lab11;

interface TextFormatter {
    String formatText(String text);
}
class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        String result1 = "";
        String[] words = text.split(" ");
        for(String word : words){
            result1 += word.substring(0, 1).toUpperCase();
            result1 += word.substring(1);
        }
        String result2 = result1.substring(0, 1).toLowerCase() + result1.substring(1);
        return result2;
    }
}

class TextEditor {
    TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void formatText(String m) {
        System.out.println(formatter.formatText(m));
    }
}

class Main3{
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setFormatter(new UpperCaseFormatter());
        textEditor.formatText("ibrahim mohamed");

        textEditor.setFormatter(new LowerCaseFormatter());
        textEditor.formatText("IBRAHIM MOHAMED");

        textEditor.setFormatter(new CamelCaseFormatter());
        textEditor.formatText("ibrahim moataz mohamed safwat said mohamed");

    }
}