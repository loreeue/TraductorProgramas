program entrada;

const
	CONSTINT = 1;
	CONSTFLOAT = 2;
	CONSTLIT = 'Hello';

function dummy_func(number: REAL): REAL;
var
	dummy_var : REAL;
begin
	dummy_var := number;
	dummy_func := dummy_var;
end;

procedure rand_array(size: INTEGER);
begin
	dummy_func(10);
	repeat
	begin
		x := x + 1;
		y := y - 1;
		if x > 1 then
		begin
			y := 2;
		end
		else
		begin
			y := 1;
		end
	end
	until x >= y;
end;

function get_value(arr, index: INTEGER): INTEGER;
begin
	get_value := dummy_func(15);
end;

procedure set_value(value, arr, index: INTEGER);
begin
	dummy_porc(20);
end;

procedure bubbleSort(arr, n: INTEGER);
var
	i, j, temp : INTEGER;
begin
	for i := 0 to n - 1 do 
	begin
		for j := 0 to n - i - 1 do 
		begin
			if arr(j) > arr(j + 1) then
			begin
				temp := get_value(arr,j);
				set_value(get_value(arr,j + 1),arr,j);
				set_value(temp,arr,j + 1);
			end
			else
			begin
				dummy_func(30);
			end
		end
	end
	while i < n - 1 then
	begin
		x();
		i := i + 3;
	end
	for i := 0 downto n - 1 do 
	begin
		x();
	end
end;

var
	size, arr2sort : INTEGER;
begin
	size := 10;
	if size <= arr2sort then
	begin
		arr2sort := rand_array(size);
	end
	else
	begin
		bubbleSort(arr2sort,size);
	end
end.
