public class Incapsulation {
    public static void main(String[] args) {
        Game minecraft = new Game("Minecraft", 4.8f, new String[]{"survival", "sandbox", "multiplayer"});
        String name = minecraft.getName();
        float rating = minecraft.getRating();
        System.out.print(name+", "+rating);
        minecraft.getType();
        minecraft.setRating(4.85f);
    }
}
class Game{
    private String name;
    private float rating;
    private String[] type;
    public Game(String name, float rating, String[] type){
        this.name =  name;
        this.rating = rating;
        this.type = type;
    }
    String getName(){
        return name;
    }
    float getRating(){
        return rating;
    }
    void getType(){
        for (int i = 0; i <type.length;i++){
            System.out.print(", "+type[i]);
        }
        System.out.println(".");
    }
    void setName(String name){
        this.name = name;
    }
    void setRating(float rating){
        this.rating = rating;
    }
    void setType(String[] type){
        this.type = type;
    }
}