#import "background_geolocation_API.h"

@implementation background_geolocation_API

//
// Here you can implement your API methods which can be called from JavaScript
// an example method is included below to get you started.
//

// This will be callable from JavaScript as 'background_geolocation.showAlert'
// it will require a parameter called text
+ (void)showAlert:(ForgeTask*)task text:(NSString *)text {
	if ([text length] == 0) {
		[task error:@"You must enter a message"];
		return;
	}
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:@"Alert"
													message:text
												   delegate:nil
										  cancelButtonTitle:@"OK"
										  otherButtonTitles:nil];
	[alert show];
	[task success:nil];
}

@end
