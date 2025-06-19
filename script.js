const display = document.getElementById('display');

function appendToDisplay(value) {
    // Prevent multiple operators in a row
    const operators = ['+', '-', '*', '/'];
    const lastChar = display.value.slice(-1);

    if (operators.includes(value)) {
        if (display.value === '' || operators.includes(lastChar)) {
            // Don't allow operator at start or two operators in a row
            return;
        }
    }

    // Prevent multiple decimals in a number
    if (value === '.') {
        // Split by operators to get current number segment
        const parts = display.value.split(/[\+\-\*\/]/);
        const currentNum = parts[parts.length - 1];
        if (currentNum.includes('.')) {
            return;
        }
    }

    display.value += value;
}

function clearDisplay() {
    display.value = '';
}

function calculateResult() {
    if (display.value === '') return;

    // Prevent calculation if last char is operator
    const operators = ['+', '-', '*', '/'];
    if (operators.includes(display.value.slice(-1))) {
        display.value = 'Error';
        return;
    }

    try {
        const result = eval(display.value);
        display.value = result;
    } catch {
        display.value = 'Error';
    }
}

