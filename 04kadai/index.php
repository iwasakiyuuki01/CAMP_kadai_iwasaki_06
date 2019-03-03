<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>


 <?php 



 //練習

//   echo'<h2>このように書いていく</h2>';
//  echo'5+7<br>';
//  echo 5+7;
//  echo '<br>'; 
 
// $apple='りんご';
// echo $apple;
// echo '<br>';
// $num=10+10;
// echo $num;
// echo '<br>';

// $a='1';
// $b='2';

// if($a==1){
//     echo '1が表示されました';
//     echo '<br>'; 
// }
// if($b==2){
//     echo '2が表示されました';
//     echo '<br>'; 
// }


//おみくじ

// echo mt_rand(1,64);
// echo '<br>'; 
// $random = mt_rand(1,9);
// echo $random;

// $omikuji = mt_rand(1,4);
// if($omikuji == 1){
// echo '大吉';
// }else if($omikuji == 2){
//     echo '吉'; 
// }else if($omikuji == 3){
//     echo '凶'; 
// }else if($omikuji == 4){
//     echo '大凶'; 
// }
// echo '<br>'; 


// おみくじ２//

// $omikuji = mt_rand(1,4);
// if($omikuji == 1){
//     echo  '<img src="https://frame-illust.com/fi/wp-content/uploads/2015/11/f6fe0470f6f7ad8ab17af774354b7404.png" class="img">';
// }else if($omikuji == 2){
//     echo '<img src="http://frame-illust.com/fi/wp-content/uploads/2015/11/f0bbdb9dba35695f75094aab6a956c9a.png" class="img">'; 
// }else if($omikuji == 3){
//     echo '<img src="https://frame-illust.com/fi/wp-content/uploads/2015/11/72791418fe314a71e08aa854ae6c548c.gif" class="img">'; 
// }else if($omikuji == 4){
//     echo '<img src="https://frame-illust.com/fi/wp-content/uploads/2015/11/54be227a70201b3c3c0e094e1f9edaf8.gif" class="img">'; 
// }

//じゃんけん
$handbox = mt_rand(1,3);



if($handbox == 1){
    $result = '<input type="radio" title="playerHand" name="playerHand" value="グー" class=in>グー'.'<input type="radio" title="playerHand" name="playerHand" value="チョキ" class=in>チョキ';
}else if($handbox == 2){
    $result  = '<input type="radio" title="playerHand" name="playerHand" value="チョキ" class=in>チョキ'.'<input type="radio" title="playerHand" name="playerHand" value="パー" class=in>パー';
}else if($handbox == 3){
    $result = '<input type="radio" title="playerHand" name="playerHand" value="グー" class=in>グー'.'<input type="radio" title="playerHand" name="playerHand" value="パー" class=in>パー';
}



?>



    <header class="header"> 
    </header>
    <main class="main">
        <h1 class="h1">2択じゃんけん</h1>
        <p>選んで勝負！！</p> 
        <img src="https://img.gifmagazine.net/gifmagazine/images/107712/original.gif" width="30%" height="30%" alt="">
        <div class="form-box">
            <form method="post" action="result.php" style='background-color: black;' >
                <div class="box">
                <?=$result;?>
                </div>
                <div class=bk>
                    <button type="submit" class="battle-button">P U S H</button>
                </div>
            </form>
        </div>
        <div class="main">
            <ul>
               <li id="omikuji">クリック　勝負の前に運試し　クリック</li>
            </ul>
                <p id="echo"></p>
        </div>

    </main>
  
</div>

<script>
    $("#omikuji").on("click",function(){
        //1乱数１〜５
        const r = Math.ceil(Math.random()*5);
        //2if分岐処理
        let view = "";
        if(r==1){
            view = '<img src="http://img-t2-cdn.itscc.biz/pman.pt.teramoba2.com/872/freepage/5c3434acb6de1.jpg" width="300">';
        }
        if(r==2){
            view = '中吉';
        }
        if(r==3){
            view = '小吉';
        }
        if(r==4){
            view = '吉';
        }
        if(r==5){
            view = '凶';
        }
        //3表示処理
        $("#echo").html(view);
    });
    
</script>


</body>
</html>