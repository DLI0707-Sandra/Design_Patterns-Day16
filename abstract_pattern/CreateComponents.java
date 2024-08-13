package org.example.abstract_pattern;

interface Button {
    void display();
}

interface TextField {
    void display();
}

class LightButton implements Button {
    @Override
    public void display() {
        System.out.println("Light Button");
    }
}

class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Dark Button");
    }
}

class LightTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Light TextField");
    }
}

class DarkTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Dark TextField");
    }
}

interface UIFactory {
    Button createButton();
    TextField createTextField();
}

class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}

class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}

public class CreateComponents
{
    private Button button;
    private TextField textField;

    public CreateComponents(UIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void displayUI() {
        button.display();
        textField.display();
    }
    
    public static void main(String[] args) {
        UIFactory lightFactory = new LightUIFactory();
        CreateComponents light = new CreateComponents(lightFactory);
        light.displayUI();

        UIFactory darkFactory = new DarkUIFactory();
        CreateComponents dark = new CreateComponents(darkFactory);
        dark.displayUI();
    }
}
