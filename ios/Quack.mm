#import "Quack.h"

@implementation Quack
RCT_EXPORT_MODULE()

- (NSNumber *)multiply:(double)a b:(double)b {
    NSNumber *result = @(quack::multiply(a, b));

    return result;
}

- (NSNumber *)add:(double)a b:(double)b {
    NSNumber *result = @(quack::add(a, b));

    return result;
}

- (NSNumber *)subtract:(double)a b:(double)b {
    NSNumber *result = @(quack::subtract(a, b));

    return result;
}

- (NSNumber *)divide:(double)a b:(double)b {
    NSNumber *result = @(quack::divide(a, b));

    return result;
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeQuackSpecJSI>(params);
}

@end
