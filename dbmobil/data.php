<?php

    require_once('koneksi.php');

    $query = "SELECT * FROM mobil";
    $sql = mysqli_query($db_connect, $query);


    if ($sql) {
        $result = array();
        while ($row = mysqli_fetch_array($sql)) {
            array_push($result, array(
                'nama' => $row['nama'],
                'harga' => $row['harga'],
                'warna' => $row['warna'],
            ) );
        }

        echo json_encode ( array('dbmobil' => $result) );
    }
    
    


?>