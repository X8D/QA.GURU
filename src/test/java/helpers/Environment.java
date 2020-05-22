package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        urlY = System.getProperty("url", "https://market.yandex.ru/"),
        itemY = System.getProperty("item", "iphone"),

        VKurl = System.getProperty("urlvk", "https://vk.com/"),
        VKlogin = System.getProperty("vklogin", "your email"),
        VKpass = System.getProperty("vkpass", "your pass"),
        VKtown = System.getProperty("vktown", "your town");
}
