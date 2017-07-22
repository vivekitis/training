<?php
header("Content-Type: application/json");
sleep(5);
$arr = array(
	'name' => 'Foo',
	'bar' => 'Yo!'
);

echo json_encode($arr);