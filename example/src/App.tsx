import { Text, View, StyleSheet } from 'react-native';
import { multiply, add } from 'react-native-quack';

const result = multiply(3, 7);
const result2 = add(3, 7);

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
      <Text>Result2: {result2}</Text>
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
