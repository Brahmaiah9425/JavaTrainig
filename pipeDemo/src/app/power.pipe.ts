import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power',
})
export class PowerPipe implements PipeTransform {
  transform(num: number, power: number = 1): number {
    return Math.pow(num, power);
  }
}
