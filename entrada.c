#define CONSTINT 1
#define CONSTFLOAT 2
#define CONSTLIT 'Hello'

float dummy_func(float number){
	float dummy_var;
	dummy_var = number;
	return dummy_var;
}

void rand_array (int size){
    // TODO.
    dummy_func(10);
    do {
        x = x + 1;
        y = y - 1;
        if (x > 1) {
            y = 2;
        }
        else {
            y = 1;
        }
    } until (x >= y)

}

int get_value(int arr, int index){
    // TODO.
    return dummy_func(15);
}

void set_value(int value, int arr, int index){
    // TODO.
    dummy_porc(20);
}

void bubbleSort(int arr, int n) {
    int i, j;
    int temp;

    for (i=0; i < n - 1; i = i + 1){
       for (j=0; j < n-i - 1; j = j + 1){
            if (arr(j) > arr(j + 1)) {
                temp = get_value(arr, j);
                set_value(get_value(arr, j + 1),arr, j);
                set_value(temp, arr, j + 1);
            }
            else{
                // DO NOTHING
                dummy_func(30);
            }

       }
    }
    for (i=0; i < n - 1; i = i + 3){
        x();
    }
    for (i=0; i < n - 1; i = i - 1){
        x();
    }
}

void main(void){
    int size;
    size = 10;
    int arr2sort;
    if (size <= arr2sort) {
        arr2sort = rand_array(size);
    }
    else {
        bubbleSort(arr2sort, size);
    }
}