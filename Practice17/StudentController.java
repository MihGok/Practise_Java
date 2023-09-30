package Practise_Java.Practice17;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class StudentController implements MouseMotionListener {
    Student model;
    StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRoll(String roll) {
        model.setRoll(roll);
    }

    public String getStudentRole() {
        return model.getRoll();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRoll());
    }

    public String Check(int curX, int curY) {
        if (curY > 600) {
            return "Север";
        } else {
            if (curY > 180 & curY < 600 & curX > 400 & curX < 615) {
                return "Запад";
            } else {
                if (curX > 995 & curX < 1195 & curY < 600 & curX > 180) {
                    return "Восток";
                } else {
                    if (curY < 180) {
                        return "Юг";
                    } else {
                        return "Центр";
                    }
                }


            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String cur = model.getName() + Check(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
    }
}
