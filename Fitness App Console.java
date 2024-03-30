import java.util.*;

public class UserProf {
    private String username;
    private String password;
    private int age;
    private int weight;
    private int height;
    private String goals;
    private String achievements;

    public UserProf(String username, String password, int age, int weight, int height, String goals, String achievements) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goals = goals;
        this.achievements = achievements;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getGoals() {
        return goals;
    }

    public String getAchievements() {
        return achievements;
    }
}
public class Activitylog extends UserProf {
    private String activitytype;
    private int duration;
    private int date;

    public Activitylog(String username, String password, int age, int weight, String activitytype, int duration, int date) {
        super(username, password, age, weight);
        this.activitytype = activitytype;
        this.duration = duration;
        this.date = date;
    }

    public String getActivitytype() {
        return activitytype;
    }

    public int getDuration() {
        return duration;
    }

    public int getDate() {
        return date;
    }
}

public class Plans extends UserProf {
    private String customplans;
    private String predefinedplans;
    private List<String> alarms;

    public Plans(String username, String password, int age, int weight, String customplans, String predefinedplans) {
        super(username, password, age, weight);
        this.customplans = customplans;
        this.predefinedplans = predefinedplans;
        this.alarms = new ArrayList<>();
    }

    public String getCustomplans() {
        return customplans;
    }

    public String getPredefinedplans() {
        return predefinedplans;
    }

    public void setAlarm(String alarmTime) {
        alarms.add(alarmTime);
    }

    public List<String> getAlarms() {
        return alarms;
    }
}

public class Social extends UserProf {
    private String friendName;
    private String friendPlan;
    private String friendAchievements;
    private List<String> challenges;

    public Social(String username, String password, int age, int weight, String friendName, String friendPlan, String friendAchievements) {
        super(username, password, age, weight);
        this.friendName = friendName;
        this.friendPlan = friendPlan;
        this.friendAchievements = friendAchievements;
        this.challenges = new ArrayList<>();
    }
    public String getFriendName() {
        return friendName;
    }
    public String getFriendPlan() {
        return friendPlan;
    }
    public String getFriendAchievements() {
        return friendAchievements;
    }
    public void postChallenge(String challenge) {
        challenges.add(challenge);
    }
    public List<String> getChallenges() {
       return challenges;
    }
}
public class Goal {
    private String goalName;

    public Goal(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalName() {
        return goalName;
    }
}