$(function() {
    
    // プレイヤーとコンピューターの勝利数を初期化
    var PointCom = 0, PointMe = 0;

    // 次のコンピュータの手を返す。
    function getNextComHand() {

        // ジャンケンの手のオブジェクト配列を定義
        var rps_hands = [ 
          { value : 'rock', label : 'グー' }, 
          { value : 'paper', label : 'パー' }, 
          { value : 'scissors', label : 'チョキ' } 
        ];
        
        // 上記の配列のインデクスとなる整数をランダムに生成
        var nextHandIndex = Math.floor(Math.random() * rps_hands.length);

        // ランダム生成したインデクスに該当する配列要素を返す。
        return rps_hands[nextHandIndex];
    }

    // ジャンケンの手 a 、 b の勝ち負けを判定
    // ( a の勝ち： 1、aの負け： -1、引き分け：０、判定不能：NaN）
    function judgeHands(a, b) {
        if (a == b)
            return 0;
        else if (a == 'rock')
            return (b == 'scissors' ? 1 : -1);
        else if (a == 'paper')
            return (b == 'rock' ? 1 : -1);
        else if (a == 'scissors')
            return (b == 'paper' ? 1 : -1);
        else
            return NaN;
    }

    // プレイヤーが選ぶ手の選択肢にクリックハンドラを設定
    $('li.rps-hand').click(function() {
        
        //クリックされた手の背景に色をつける。
        $('span','li.rps-hand').css({backgroundColor: "#FFF"});
        $('span', this).css({backgroundColor: "#87ceeb"});
        
        // プレイヤーの手
        var myHandValue = $(this).data('rps');
        
        // コンピューターの手
        var comHand = getNextComHand();
        
        // コンピュータの手を表示
        $("#pc").text( "コンピュータ：" + comHand.label );

        // 勝ち負けの判定
        var judge = judgeHands(myHandValue, comHand.value);
        
        // 判定結果のメッセージを表示
        var message = ( judge != 0 ? "あなたの" + (judge > 0 ? "勝ち":"負け") + "です。" 
           : (! isNaN(judge) ? "引き分けです":"判定不能" ) );
        $("#message").text(message);
        
        // 勝ち数の更新
        if ( judge == 1) 
            $('#point_me').text(++ PointMe);
        else if ( judge == -1) 
            $('#point_com').text(++ PointCom);
    });
});