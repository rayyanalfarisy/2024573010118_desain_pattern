package Praktikum_6.bagian_2.dengan_lsp;

public class SocialMediaPost {
    protected String content;

    public SocialMediaPost(String content){
        this.content = content;
    }

    public void publish(){
        System.out.println("Publishing post:" + content);
    }

    public int calculateMaxCharacters(){
        return 1000;
    }
}
