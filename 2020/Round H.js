/**
 * * A solution implementing generator
 */

const fs = require("fs")
const input = fs.readFileSync(0, 'utf8')

class Problem {
  constructor(input) {
    this.itterator = this.generateInput(input)
  }

  run() {
    const t = this.next()
    for (let i = 1; i <= t; ++i) {
      this.log(i, this.solve())
    }
  }

  log(index, answer) {
    console.log("Case #" + index + ": " + answer);
  }

  *generateInput(input) {
    for (const chunk of input.split(/ |\n/)) {
      yield chunk
    }
  }
  next() {
    const next = this.itterator.next()
    return next.value
  }
}

class Solution extends Problem {
  solve() {
    const L = this.next()
    const R = this.next()
    // ------------------
    let result = 0

    for (let number = R; number < L; number++) {
      const splittedNumber = String(number).split("")
      for (let i = 0; i < splittedNumber.length; i++) {
        const digit = splittedNumber[i]

      }
    }

    return result
  }
}


function isBorring(n) {
  const isOdd = n => Boolean(n & 1)
  const splittedNumber = String(n).split("")
  for (let i = 0; i < splittedNumber.length; i++) {
    const digit = Number(splittedNumber[i])
    if (isOdd(i + 1) !== isOdd(digit)) {
      return [false, (n >>> 0).toString(2)]
    }
  }
  return [true, (n >>> 0).toString(2)]
}

new Solution(input).run()
