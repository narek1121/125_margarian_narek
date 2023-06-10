package task;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebAddressParser {
    //набор приватных членов
    private String url;
    //группы делим друг от друга скобками
    //отсчет будет идти с единицы
    // #1 группа - схема
    // #2 группа - login
    // #3 группа - password
    // #4 группа - host
    // #5 группа - port
    // #6 группа - url
    // #7 группа - параметры
    // #8 группа - якорь
    private Pattern pattern = Pattern.compile("(https?|ftp|file):(//(([a-zA-Z0-9_]+)(:([a-zA-Z0-9_]+))@)?([a-zA-Z0-9_|.]+)*(:([0-9{4}]+))?)?(\\/([a-zA-Z0-9_|/]+))*(\\?([a-zA-Z0-9_|=&]+))*(\\#([a-zA-Zа-яА-Я0-9_]+))?");

    //конструктор
    public WebAddressParser(String url){
        this.url = url;
        if(isValid()){
            this.url = url;
        } else {
            this.url = "";
        }
    }

    public boolean isValid(){
        Matcher matcher = pattern.matcher(this.url);
        return matcher.matches();
    }

    //сравниваем первую группу с правильной первой группой; при положительном результате записывает ее
    public String getScheme(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(1) != null)
            return matcher.group(1);
        else
            return "";
    }

    public String getLogin(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(4) != null)
            return matcher.group(4);
        else
            return "";
    }

    public String getPassword(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(6) != null)
            return matcher.group(6);
        else
            return "";
    }

    public String getHost(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(7) != null)
            return matcher.group(7);
        else
            return "";
    }

    public String getPort(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(9) != null)
            return matcher.group(9);
        else
            return "";
    }

    public String getUrl(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(11) != null)
            return matcher.group(11);
        else
            return "";
    }

    public HashMap <String, String> getParameters(){
        HashMap <String, String> parameters = new HashMap<>();
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(13) != null){
            String[] params = (matcher.group(13)).split("&|=");
            for(int i = 0; i < params.length; i+=2){
                parameters.put(params[i], params[i+1]);
            }
            return parameters;
        }
        else
            return parameters;
    }

    public String getFragment(){
        Matcher matcher = pattern.matcher(this.url);
        if(matcher.find() && matcher.group(15) != null)
            return matcher.group(15);
        else
            return "";
    }
}