<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <?php
$hand = ["グー","チョキ","パー"];
$player =$_POST["playerHand"];
$cp = $hand[array_rand($hand)];

if($player == "グー" && $cp == "グー"){
    $result="あいこ";
}else if($player == "グー" && $cp == "パー"){
    $result="負け";
}else if($player == "グー" && $cp == "チョキ"){
    $result="勝ち";

}else if($player == "チョキ" && $cp == "グー"){
    $result="負け";
}else if($player == "チョキ" && $cp == "パー"){
    $result="勝ち";
}else if($player == "チョキ" && $cp == "チョキ"){
    $result="あいこ";

}else if($player == "パー" && $cp == "パー"){
    $result="あいこ";
}else if($player == "パー" && $cp == "チョキ"){
    $result="負け";
}else if($player == "パー" && $cp == "グー"){
    $result="勝ち";
}else{
    $result="手を選択してください";
}


    ?>

<header class="header">
</header>
    <main class="main">
        <h1 class="h1">結果は・・・</h1>
        <div class="result-box">
            <p class="result-word"><?= $result ?>！</p>

            <p>あなた：<?= $player ?><br></p>
            <p>コンピューター：<?= $cp ?><br></p>

            <p><a class="red" href="index.php">"もう一度勝負する"</a></p>
        </div>
    </main>

    
</body>
</html>