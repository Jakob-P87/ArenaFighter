package data;

public class Level
{
    private int experience;
    private int neededExp;
    private int levelUp;

    public Level()
    {
        this.experience = 0;
        this.neededExp = 0;
        this.levelUp = 0;
    }

    public int getExperience()
    {
        return experience;
    }

    public void setExperience(int experience)
    {
        this.experience = experience;
    }

    public int getNeededExp()
    {
        return neededExp;
    }

    public void setNeededExp(int neededExp)
    {
        this.neededExp = neededExp;
    }

    public int getLevelUp()
    {
        return levelUp;
    }

    public void setLevelUp(int levelUp)
    {
        this.levelUp = levelUp;
    }
}
