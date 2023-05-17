package main.java.ru.netology;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
