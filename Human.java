public class Human
{
    private String name;
    private int age;
    private String race;

    public static class Head
    {
        private String colour, shape;

        public Head(String c, String s)
        {
            colour = c;
            shape = s;
        }

        public void setColour(String colour)
        {
            this.colour = colour;
        }

        public void setShape(String shape)
        {
            this.shape = shape;
        }

        public String getColour()
        {
            return colour;
        }

        public String getShape()
        {
            return shape;
        }
    }

    public static class Leg
    {
        private int length, toes;
        public Leg(int l, int t)
        {
            length = l;
            toes = t;
        }

        public void setLength(int length)
        {
            this.length = length;
        }

        public void setToes(int toes)
        {
            this.toes = toes;
        }

        public int getLength()
        {
            return length;
        }

        public int getToes()
        {
            return toes;
        }
    }

    public static class Hand
    {
        private String skin;
        private int fingers;
        public Hand(String s, int f)
        {
            skin = s;
            fingers = f;
        }

        public void setSkin(String skin)
        {
            this.skin = skin;
        }

        public void setFingers(int fingers)
        {
            this.fingers = fingers;
        }

        public String getSkin()
        {
            return skin;
        }

        public int getFingers()
        {
            return fingers;
        }
    }

    public Human()
    {
        Head head = new Head("white", "round");
        Leg leg = new Leg(123, 5);
        Hand hand = new Hand("white", 5);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getRace()
    {
        return race;
    }

    public int getAge()
    {
        return age;
    }
}