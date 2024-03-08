# Picnic Analysis

## Описание
Данная программа представляет собой инструмент анализа содержимого файла с продуктами, предположительно для пикника. В
файле указаны различные слова, представляющие собой наименования фруктов, овощей и других продуктов. Задача программы -
проанализировать содержимое файла и предоставить следующую информацию:

1. Подсчет слов: программа подсчитывает общее количество слов в файле.
2. Поиск самого длинного слова: находит наибольшее по длине слово в файле.
3. Вычисление частоты слов: анализирует, сколько раз каждое слово встречается в файле.

## Описание решения
Программа состоит из двух классов:

### 1. Main
Главный класс, который запускает анализ. Он использует объект класса `PicnicAnalyzer` для выполнения всех задач анализа
текста.

### 2. PicnicAnalyzer
Класс `PicnicAnalyzer` отвечает за обработку и анализ содержимого текстового файла. Он содержит методы для выполнения
трех основных задач:

* `countWords(String filename)`: подсчитывает общее количество слов в файле.
* `findLongestWord(String filename)`: находит самое длинное слово в файле.
* `calculateWordFrequencies(String filename)`: вычисляет частоту встречаемости каждого слова в файле.

Каждый метод использует класс `BufferedReader` для чтения содержимого файла построчно, а затем анализирует каждую строку
для выполнения требуемой задачи.

## Рекомендации
Программа использует циклы и коллекции для упрощения анализа текста. В частности, `HashMap` используется для подсчета
частоты встречаемости слов. Это эффективный способ хранения и обработки данных, поэтому рекомендуется использовать его
для подобных задач.

Также рекомендуется убедиться, что файл с данными расположен в той же директории, что и исполняемый файл программы,
чтобы избежать проблем с чтением файлов. Если это не так, укажите полный путь к файлу в переменной `filename`.