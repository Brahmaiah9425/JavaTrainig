import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reverse',
})
export class ReversePipe implements PipeTransform {
  transform(value: string | any[]): string | any[] {
    if (!value) return value;
    if (typeof value === 'string') {
      return value.split('').reverse().join('');
    } else if (Array.isArray(value)) {
      return value.slice().reverse(); // Ensures original array is not modified
    }
    return value;
  }
}
