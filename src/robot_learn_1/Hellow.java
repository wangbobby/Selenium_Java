package robot_learn_1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Hellow {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {

        // ����������
        Robot robot = new Robot();
        // ����Ĭ������ʱ��
        robot.setAutoDelay(300);

        // ����alt��
        robot.keyPress(KeyEvent.VK_ALT);
        // ����shift��
        robot.keyPress(KeyEvent.VK_SHIFT);
        // ����n��
        robot.keyPress(KeyEvent.VK_N);

        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_N);

        // ���������ϼ�
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);

        // ���µ���س���
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // ����Ĭ������ʱ��20����
        robot.setAutoDelay(20);
        for (String c : "class".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // ����Ǵ�д
                // ��������
                // ���µ���CapsLock����Ϊ���л���Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // ���µ���CapsLock�����л���ԭ���Ĵ�Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // �����Сд
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // ����Ĭ������ʱ��300����
        robot.setAutoDelay(300);
        // ���µ���س���
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        String automaton = "Automaton";
        robot.setAutoDelay(20);
        for (String c : automaton.split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // ����Ǵ�д
                // ���µ���CapsLock����Ϊ���л���Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // ���µ���CapsLock�����л���ԭ���Ĵ�Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // �����Сд
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        robot.setAutoDelay(300);
        // ���µ���س���
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // ���������¼�
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        
        // ����main����
        // ����Ĭ������ʱ�䣬��������ĸ��һ��
        robot.setAutoDelay(20);
        for (String c : "main".split("")) {

            if (Character.isUpperCase(c.charAt(0))) {
                // ����Ǵ�д
                // ��������
                // ���µ���CapsLock����Ϊ���л���Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // ���µ���CapsLock�����л���ԭ���Ĵ�Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // �����Сд
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // ��������ʱ��Ϊ300����
        robot.setAutoDelay(300);
        // ���µ���alt+/�Ŀ�ݼ�
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SLASH);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SLASH);
        // ����500�������Զ���ʾ���ܲ������
        robot.delay(500);
        // ���µ���س���
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // ����Ĭ������ʱ�䣬��������ĸ��һ��
        robot.setAutoDelay(20);
        for (String c : "syso".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // ����Ǵ�д
                // ���µ���CapsLock����Ϊ���л���Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                // ���µ���CapsLock�����л���ԭ���Ĵ�Сд
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                // �����Сд
                // ѭ��ÿ���ַ��������ַ�ȡ��map�д洢�ļ�ֵ
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // ���µ���alt+/�Ŀ�ݼ�
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SLASH);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SLASH);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_QUOTE);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_QUOTE);
        // ����50�������Զ���ʾ���ܲ������
        robot.delay(50);
        // ѭ������Hellow Word
        for (String c : "Hellow Word,I am a skynet".split("")) {
            if (Character.isUpperCase(c.charAt(0))) {
                // ��������
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            } else {
                robot.keyPress(KeyMap.keyMap.get(c.toUpperCase()));
                robot.keyRelease(KeyMap.keyMap.get(c.toUpperCase()));
            }
        }
        // ���� ���µ���ctrl+s
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        // ���� ���µ���ctrl+F11
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_F11);

    }
}