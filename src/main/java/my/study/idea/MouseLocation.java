package my.study.idea;

import java.awt.*;

/**
 * @author yanmiao.wu
 * @create 2023-04-23 17:50
 * 获取当前鼠标位置，并打印到控制台
 * 每隔0.5s获取一次
 */
public class MouseLocation {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Point mousePoint = MouseInfo.getPointerInfo().getLocation();
            int x = (int) mousePoint.getX();
            int y = (int) mousePoint.getY();
            System.out.println("Mouse position: (" + x + ", " + y + ")");
            Thread.sleep(500);
        }
    }
}
