package main.java.ru.netology;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
