package answer;

/**
 * @author m-sakai
 * ジャンケンを行うプレイヤークラス
 */
public class Player {

	//勝利数
    private int winCount;

    //選択手
    private int hand;

    /**
     * コンストラクタ
     */
    Player() {
        this.winCount = 0;
        this.hand = 0;
    }

    /**
     * 入力によって表示する文言を表示
     */
    public void outputHand(int hand) {
        // 入力された手で表示文言を変更
        // 手が0（グー）だった場合
        if (hand == Constant.STONE) {
            System.out.print(Constant.STONE_MESSAGE);

            // 手が1（チョキ）だった場合
        } else if (hand == Constant.SCISSORS) {
            System.out.print(Constant.SCISSORS_MESSAGE);

            // それ以外（パー）だった場合
        } else {
            System.out.print(Constant.PAPER_MESSAGE);
        }

    }

    //セッターゲッター（プロパティ）
    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

}
