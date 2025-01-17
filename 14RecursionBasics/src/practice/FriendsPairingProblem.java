package practice;

public class FriendsPairingProblem {

    public static int returnFriendsPairingProblem(int friends ) {
        if (friends <= 2) {
            return friends;
        }
        // choices
        //single
        int single = returnFriendsPairingProblem(friends - 1);
        //pairs
        int two = returnFriendsPairingProblem(friends - 2);
        int pairWays = (friends - 1) * two;

        return  single + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(returnFriendsPairingProblem(4));
    }

}
