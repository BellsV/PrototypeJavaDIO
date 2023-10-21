package dio.project.Project_prototype;

import java.util.Objects;
public abstract class Formas {
    public int x;
    public int y;
    public String color;

    public Formas(){}
    public Formas(Formas target){
        if (target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Formas clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Formas)) return false;
        Formas formas2 = (Formas) object2;
        return formas2.x == x && formas2.y == y && Objects.equals(formas2.color, color);
    }
}
