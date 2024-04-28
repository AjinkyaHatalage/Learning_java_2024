package Advanced_Java.Enumration;

enum colorEnum {
    RED("red"),GREEN("green"),BLUE("blue");
    private String value;

    colorEnum(String value){
        this.value=value;
    }
    public  String getValue(){
        return value;
    }
}
