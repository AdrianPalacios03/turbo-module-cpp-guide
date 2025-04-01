# How to use C++ in React Native
1. npx create-react-native-library@latest <package-name>
2. cd <package-name>
3. touch yarn.lock
4. yarn
5. cd example && bundle install && yarn
6. cd ios && pod install && cd ..
7. yarn start
8. yarn ios
9. Modify applicationId in example/android/app/build.gradle to com.<package-name>
10. yarn android

That is for basic setup.

# How to add more functions

Check the fourth commit of this repo. It has an example of how using C++ in React Native without writing any native code, including Kotlin code wich at first glance it looks like it should be written in Kotlin.


1. bundle exec install

# react-native-quack
## Installation

```sh
npm install react-native-quack
```

## Usage


```js
import { multiply } from 'react-native-quack';

// ...

const result = multiply(3, 7);
```


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
