import { Text, View, StyleSheet } from 'react-native';
import { multiply, add, subtract, divide } from 'react-native-quack';

const result = multiply(3, 7);
const result2 = add(3, 7);
const result3 = subtract(10, 3);
const result4 = divide(10, 2);

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Result of multiply: {result}</Text>
      <Text>Result of add: {result2}</Text>
      <Text>Result of subtract: {result3}</Text>
      <Text>Result of divide: {result4}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
