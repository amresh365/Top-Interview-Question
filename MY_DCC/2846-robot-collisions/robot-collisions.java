class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            //Here we create new single object of every robot with the pos halth and direction 
            robots.add(new Robot(positions[i], healths[i], directions.charAt(i), i));
        }

        Collections.sort(robots, (a, b) -> a.position - b.position);
        Deque<Robot> stack = new ArrayDeque<>();
        Integer[] result = new Integer[positions.length];

        for (Robot robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && robot.health > 0) {
                    Robot rightRobot = stack.pop();
                    if (rightRobot.health < robot.health) {
                        robot.health -= 1;
                    } else if (rightRobot.health > robot.health) {
                        rightRobot.health -= 1;
                        stack.push(rightRobot);
                        robot = null;
                        break;
                    } else {
                        robot = null;
                        break;
                    }
                }
                if (robot != null) {
                    result[robot.index] = robot.health;
                }
            }
        }

        while (!stack.isEmpty()) {
            Robot rightRobot = stack.pop();
            result[rightRobot.index] = rightRobot.health;
        }

        List<Integer> finalResult = new ArrayList<>();
        for (Integer health : result) {
            if (health != null) {
                finalResult.add(health);
            }
        }
        
        return finalResult;
    }

    class Robot {
        int position;
        int health;
        char direction;
        int index;

        Robot(int position, int health, char direction, int index) {
            this.position = position;
            this.health = health;
            this.direction = direction;
            this.index = index;
        }
    }
}