## Часть 1. TestNG

**Что нужно сделать**
Сделайте ветку testng, в которой:

1. Добавьте в зависимости TestNG:

```dependencies {
    testImplementation 'org.testng:testng:7.1.0'

}

test {
    useTestNG()
}
```

**Особенности**
На этом уровне для нас поменяется всего три вещи:

1. Аннотация @Test должна иметь Fully Qualified Name org.testng.annotations.Test.
2. Asserts расположены в классе org.testng.Assert. Обратите внимание: в TestNG принято actual, expected вместо expected, actual.
3. Класс и тестовые методы должны иметь модификатор доступа public. Именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах.
