package org.waveapi.api.entities;

public class EntityBox {

    public static class fixed extends EntityBox {
        public fixed(float width, float height) {}

        public float getWidth() {return 0f;}

        public void setWidth(float width) {}

        public float getHeight() {return 0f;}

        public void setHeight(float height) {}
    }

}
